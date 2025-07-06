package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FruitPear: ImageVector
    get() {
        if (_FruitPear != null) {
            return _FruitPear!!
        }
        _FruitPear = ImageVector.Builder(
            name = "FruitPear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16f)
                curveTo(18f, 19.31f, 15.31f, 22f, 12f, 22f)
                curveTo(8.69f, 22f, 6f, 19.31f, 6f, 16f)
                curveTo(6f, 13f, 8f, 13f, 8f, 10f)
                curveTo(8f, 8.56f, 8.75f, 7.22f, 10f, 6.5f)
                curveTo(10.4f, 6.27f, 10.82f, 6.12f, 11.25f, 6.04f)
                verticalLineTo(5f)
                curveTo(11.25f, 4.63f, 11.17f, 4.42f, 11.03f, 4.28f)
                curveTo(10.9f, 4.14f, 10.63f, 4f, 10f, 4f)
                verticalLineTo(2.5f)
                curveTo(10.88f, 2.5f, 11.6f, 2.73f, 12.09f, 3.22f)
                curveTo(12.58f, 3.71f, 12.75f, 4.38f, 12.75f, 5f)
                verticalLineTo(6.04f)
                curveTo(13.18f, 6.12f, 13.61f, 6.27f, 14f, 6.5f)
                curveTo(15.25f, 7.22f, 16f, 8.56f, 16f, 10f)
                curveTo(16f, 13f, 18f, 13f, 18f, 16f)
                close()
            }
        }.build()

        return _FruitPear!!
    }

@Suppress("ObjectPropertyName")
private var _FruitPear: ImageVector? = null
