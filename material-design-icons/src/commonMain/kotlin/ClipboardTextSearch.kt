package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardTextSearch: ImageVector
    get() {
        if (_ClipboardTextSearch != null) {
            return _ClipboardTextSearch!!
        }
        _ClipboardTextSearch = ImageVector.Builder(
            name = "ClipboardTextSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.18f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                curveTo(10.08f, 14.32f, 10.23f, 13.64f, 10.5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(11.82f)
                curveTo(11.85f, 10.97f, 11.87f, 10.94f, 11.9f, 10.9f)
                curveTo(13.17f, 9.64f, 14.84f, 9f, 16.5f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(16.5f)
                curveTo(18.12f, 9f, 19.74f, 9.61f, 21f, 10.82f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(13.06f)
                curveTo(12.65f, 20.74f, 12.26f, 20.45f, 11.9f, 20.1f)
                curveTo(11f, 19.21f, 10.45f, 18.13f, 10.18f, 17f)
                moveTo(12f, 3f)
                curveTo(12.55f, 3f, 13f, 3.45f, 13f, 4f)
                reflectiveCurveTo(12.55f, 5f, 12f, 5f)
                reflectiveCurveTo(11f, 4.55f, 11f, 4f)
                reflectiveCurveTo(11.45f, 3f, 12f, 3f)
                moveTo(20.31f, 17.9f)
                curveTo(20.75f, 17.21f, 21f, 16.38f, 21f, 15.5f)
                curveTo(21f, 13f, 19f, 11f, 16.5f, 11f)
                reflectiveCurveTo(12f, 13f, 12f, 15.5f)
                reflectiveCurveTo(14f, 20f, 16.5f, 20f)
                curveTo(17.37f, 20f, 18.19f, 19.75f, 18.88f, 19.32f)
                lineTo(22f, 22.39f)
                lineTo(23.39f, 21f)
                lineTo(20.31f, 17.9f)
                moveTo(16.5f, 18f)
                curveTo(15.12f, 18f, 14f, 16.88f, 14f, 15.5f)
                reflectiveCurveTo(15.12f, 13f, 16.5f, 13f)
                reflectiveCurveTo(19f, 14.12f, 19f, 15.5f)
                reflectiveCurveTo(17.88f, 18f, 16.5f, 18f)
                close()
            }
        }.build()

        return _ClipboardTextSearch!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTextSearch: ImageVector? = null
