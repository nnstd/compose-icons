package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CosineWave: ImageVector
    get() {
        if (_CosineWave != null) {
            return _CosineWave!!
        }
        _CosineWave = ImageVector.Builder(
            name = "CosineWave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 2f)
                verticalLineTo(4f)
                curveTo(20.26f, 4f, 19f, 8.58f, 17.96f, 12.27f)
                curveTo(16.57f, 17.27f, 15.26f, 22f, 12f, 22f)
                curveTo(8.74f, 22f, 7.43f, 17.27f, 6.04f, 12.27f)
                curveTo(5f, 8.58f, 3.74f, 4f, 2f, 4f)
                verticalLineTo(2f)
                curveTo(5.26f, 2f, 6.57f, 6.73f, 7.96f, 11.73f)
                curveTo(9f, 15.42f, 10.26f, 20f, 12f, 20f)
                curveTo(13.74f, 20f, 15f, 15.42f, 16.04f, 11.73f)
                curveTo(17.43f, 6.73f, 18.74f, 2f, 22f, 2f)
                close()
            }
        }.build()

        return _CosineWave!!
    }

@Suppress("ObjectPropertyName")
private var _CosineWave: ImageVector? = null
