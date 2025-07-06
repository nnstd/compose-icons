package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardListOutline: ImageVector
    get() {
        if (_ClipboardListOutline != null) {
            return _ClipboardListOutline!!
        }
        _ClipboardListOutline = ImageVector.Builder(
            name = "ClipboardListOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(12f, 3f)
                curveTo(12.55f, 3f, 13f, 3.45f, 13f, 4f)
                reflectiveCurveTo(12.55f, 5f, 12f, 5f)
                reflectiveCurveTo(11f, 4.55f, 11f, 4f)
                reflectiveCurveTo(11.45f, 3f, 12f, 3f)
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(12f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                moveTo(12f, 11f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                moveTo(8f, 12f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                moveTo(9.25f, 14f)
                curveTo(9.66f, 14f, 10f, 14.34f, 10f, 14.75f)
                curveTo(10f, 14.95f, 9.92f, 15.14f, 9.79f, 15.27f)
                lineTo(8.12f, 17f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(17.08f)
                lineTo(9f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(9.25f)
            }
        }.build()

        return _ClipboardListOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardListOutline: ImageVector? = null
