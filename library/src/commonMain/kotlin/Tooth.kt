package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tooth: ImageVector
    get() {
        if (_Tooth != null) {
            return _Tooth!!
        }
        _Tooth = ImageVector.Builder(
            name = "Tooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                curveTo(4f, 2f, 2f, 5f, 2f, 8f)
                curveTo(2f, 10.11f, 3f, 13f, 4f, 14f)
                curveTo(5f, 15f, 6f, 22f, 8f, 22f)
                curveTo(12.54f, 22f, 10f, 15f, 12f, 15f)
                curveTo(14f, 15f, 11.46f, 22f, 16f, 22f)
                curveTo(18f, 22f, 19f, 15f, 20f, 14f)
                curveTo(21f, 13f, 22f, 10.11f, 22f, 8f)
                curveTo(22f, 5f, 20f, 2f, 17f, 2f)
                curveTo(14f, 2f, 14f, 3f, 12f, 3f)
                curveTo(10f, 3f, 10f, 2f, 7f, 2f)
                close()
            }
        }.build()

        return _Tooth!!
    }

@Suppress("ObjectPropertyName")
private var _Tooth: ImageVector? = null
