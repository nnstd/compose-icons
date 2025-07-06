package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckboxMarkedCircleAutoOutline: ImageVector
    get() {
        if (_CheckboxMarkedCircleAutoOutline != null) {
            return _CheckboxMarkedCircleAutoOutline!!
        }
        _CheckboxMarkedCircleAutoOutline = ImageVector.Builder(
            name = "CheckboxMarkedCircleAutoOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22f)
                curveTo(12.8f, 22f, 13.6f, 21.9f, 14.3f, 21.7f)
                curveTo(13.9f, 21.2f, 13.5f, 20.6f, 13.3f, 19.9f)
                curveTo(12.9f, 20f, 12.4f, 20f, 12f, 20f)
                curveTo(7.6f, 20f, 4f, 16.4f, 4f, 12f)
                curveTo(4f, 7.6f, 7.6f, 4f, 12f, 4f)
                curveTo(12.8f, 4f, 13.5f, 4.1f, 14.2f, 4.3f)
                lineTo(15.8f, 2.7f)
                curveTo(14.6f, 2.3f, 13.3f, 2f, 12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                moveTo(6.5f, 11.5f)
                lineTo(7.9f, 10.1f)
                lineTo(11f, 13.2f)
                lineTo(19.6f, 4.6f)
                lineTo(21f, 6f)
                lineTo(11f, 16f)
                lineTo(6.5f, 11.5f)
                moveTo(19f, 14f)
                lineTo(17.74f, 16.75f)
                lineTo(15f, 18f)
                lineTo(17.74f, 19.26f)
                lineTo(19f, 22f)
                lineTo(20.25f, 19.26f)
                lineTo(23f, 18f)
                lineTo(20.25f, 16.75f)
                lineTo(19f, 14f)
                close()
            }
        }.build()

        return _CheckboxMarkedCircleAutoOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxMarkedCircleAutoOutline: ImageVector? = null
