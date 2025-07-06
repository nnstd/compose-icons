package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckboxMarkedCircleMinusOutline: ImageVector
    get() {
        if (_CheckboxMarkedCircleMinusOutline != null) {
            return _CheckboxMarkedCircleMinusOutline!!
        }
        _CheckboxMarkedCircleMinusOutline = ImageVector.Builder(
            name = "CheckboxMarkedCircleMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.3f, 21.7f)
                curveTo(13.6f, 21.9f, 12.8f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                curveTo(13.3f, 2f, 14.6f, 2.3f, 15.8f, 2.7f)
                lineTo(14.2f, 4.3f)
                curveTo(13.5f, 4.1f, 12.8f, 4f, 12f, 4f)
                curveTo(7.6f, 4f, 4f, 7.6f, 4f, 12f)
                curveTo(4f, 16.4f, 7.6f, 20f, 12f, 20f)
                curveTo(12.4f, 20f, 12.9f, 20f, 13.3f, 19.9f)
                curveTo(13.5f, 20.6f, 13.9f, 21.2f, 14.3f, 21.7f)
                moveTo(7.9f, 10.1f)
                lineTo(6.5f, 11.5f)
                lineTo(11f, 16f)
                lineTo(21f, 6f)
                lineTo(19.6f, 4.6f)
                lineTo(11f, 13.2f)
                lineTo(7.9f, 10.1f)
                moveTo(15f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _CheckboxMarkedCircleMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxMarkedCircleMinusOutline: ImageVector? = null
