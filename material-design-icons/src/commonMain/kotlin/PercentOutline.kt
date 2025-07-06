package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PercentOutline: ImageVector
    get() {
        if (_PercentOutline != null) {
            return _PercentOutline!!
        }
        _PercentOutline = ImageVector.Builder(
            name = "PercentOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 3.5f)
                lineTo(20.5f, 5.5f)
                lineTo(5.5f, 20.5f)
                lineTo(3.5f, 18.5f)
                lineTo(18.5f, 3.5f)
                moveTo(7f, 4f)
                curveTo(8.66f, 4f, 10f, 5.34f, 10f, 7f)
                curveTo(10f, 8.66f, 8.66f, 10f, 7f, 10f)
                curveTo(5.34f, 10f, 4f, 8.66f, 4f, 7f)
                curveTo(4f, 5.34f, 5.34f, 4f, 7f, 4f)
                moveTo(17f, 14f)
                curveTo(18.66f, 14f, 20f, 15.34f, 20f, 17f)
                curveTo(20f, 18.66f, 18.66f, 20f, 17f, 20f)
                curveTo(15.34f, 20f, 14f, 18.66f, 14f, 17f)
                curveTo(14f, 15.34f, 15.34f, 14f, 17f, 14f)
                moveTo(7f, 6f)
                curveTo(6.45f, 6f, 6f, 6.45f, 6f, 7f)
                curveTo(6f, 7.55f, 6.45f, 8f, 7f, 8f)
                curveTo(7.55f, 8f, 8f, 7.55f, 8f, 7f)
                curveTo(8f, 6.45f, 7.55f, 6f, 7f, 6f)
                moveTo(17f, 16f)
                curveTo(16.45f, 16f, 16f, 16.45f, 16f, 17f)
                curveTo(16f, 17.55f, 16.45f, 18f, 17f, 18f)
                curveTo(17.55f, 18f, 18f, 17.55f, 18f, 17f)
                curveTo(18f, 16.45f, 17.55f, 16f, 17f, 16f)
                close()
            }
        }.build()

        return _PercentOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PercentOutline: ImageVector? = null
