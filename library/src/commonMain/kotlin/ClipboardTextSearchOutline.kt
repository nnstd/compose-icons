package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardTextSearchOutline: ImageVector
    get() {
        if (_ClipboardTextSearchOutline != null) {
            return _ClipboardTextSearchOutline!!
        }
        _ClipboardTextSearchOutline = ImageVector.Builder(
            name = "ClipboardTextSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 9f)
                horizontalLineTo(16.5f)
                horizontalLineTo(17f)
                moveTo(7f, 15f)
                horizontalLineTo(10f)
                curveTo(10.08f, 14.32f, 10.23f, 13.64f, 10.5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                moveTo(11.9f, 10.9f)
                curveTo(13.17f, 9.64f, 14.84f, 9f, 16.5f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(11.82f)
                curveTo(11.85f, 10.97f, 11.87f, 10.94f, 11.9f, 10.9f)
                moveTo(11.9f, 20.1f)
                curveTo(12.26f, 20.45f, 12.65f, 20.74f, 13.06f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(9.18f)
                curveTo(9.5f, 2.16f, 10.14f, 1.5f, 11f, 1.2f)
                curveTo(12.53f, 0.64f, 14.25f, 1.44f, 14.82f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(10.82f)
                curveTo(20.4f, 10.24f, 19.72f, 9.8f, 19f, 9.5f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(11.03f)
                curveTo(11.27f, 19.39f, 11.57f, 19.76f, 11.9f, 20.1f)
                moveTo(11f, 4f)
                curveTo(11f, 4.55f, 11.45f, 5f, 12f, 5f)
                reflectiveCurveTo(13f, 4.55f, 13f, 4f)
                reflectiveCurveTo(12.55f, 3f, 12f, 3f)
                reflectiveCurveTo(11f, 3.45f, 11f, 4f)
                moveTo(23.39f, 21f)
                lineTo(22f, 22.39f)
                lineTo(18.88f, 19.32f)
                curveTo(18.19f, 19.75f, 17.37f, 20f, 16.5f, 20f)
                curveTo(14f, 20f, 12f, 18f, 12f, 15.5f)
                reflectiveCurveTo(14f, 11f, 16.5f, 11f)
                reflectiveCurveTo(21f, 13f, 21f, 15.5f)
                curveTo(21f, 16.38f, 20.75f, 17.21f, 20.31f, 17.9f)
                lineTo(23.39f, 21f)
                moveTo(19f, 15.5f)
                curveTo(19f, 14.12f, 17.88f, 13f, 16.5f, 13f)
                reflectiveCurveTo(14f, 14.12f, 14f, 15.5f)
                reflectiveCurveTo(15.12f, 18f, 16.5f, 18f)
                reflectiveCurveTo(19f, 16.88f, 19f, 15.5f)
                close()
            }
        }.build()

        return _ClipboardTextSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTextSearchOutline: ImageVector? = null
