package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardTextOffOutline: ImageVector
    get() {
        if (_ClipboardTextOffOutline != null) {
            return _ClipboardTextOffOutline!!
        }
        _ClipboardTextOffOutline = ImageVector.Builder(
            name = "ClipboardTextOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(15.8f)
                lineTo(21f, 17.8f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(14.82f)
                curveTo(14.25f, 1.44f, 12.53f, 0.64f, 11f, 1.2f)
                curveTo(10.14f, 1.5f, 9.5f, 2.16f, 9.18f, 3f)
                horizontalLineTo(6.2f)
                lineTo(10.2f, 7f)
                horizontalLineTo(17f)
                moveTo(12f, 3f)
                curveTo(12.55f, 3f, 13f, 3.45f, 13f, 4f)
                reflectiveCurveTo(12.55f, 5f, 12f, 5f)
                reflectiveCurveTo(11f, 4.55f, 11f, 4f)
                reflectiveCurveTo(11.45f, 3f, 12f, 3f)
                moveTo(14.2f, 11f)
                lineTo(12.2f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(14.2f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3f, 4.9f)
                curveTo(3f, 4.93f, 3f, 4.97f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(19.03f, 21f, 19.07f, 21f, 19.1f, 21f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(5f, 19f)
                verticalLineTo(6.89f)
                lineTo(7.11f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(9.11f)
                lineTo(11.11f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(13.11f)
                lineTo(17.11f, 19f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _ClipboardTextOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTextOffOutline: ImageVector? = null
