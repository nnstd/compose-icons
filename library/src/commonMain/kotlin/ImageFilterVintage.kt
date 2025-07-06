package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageFilterVintage: ImageVector
    get() {
        if (_ImageFilterVintage != null) {
            return _ImageFilterVintage!!
        }
        _ImageFilterVintage = ImageVector.Builder(
            name = "ImageFilterVintage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                moveTo(18.7f, 12.4f)
                curveTo(18.42f, 12.24f, 18.13f, 12.11f, 17.84f, 12f)
                curveTo(18.13f, 11.89f, 18.42f, 11.76f, 18.7f, 11.6f)
                curveTo(20.62f, 10.5f, 21.69f, 8.5f, 21.7f, 6.41f)
                curveTo(19.91f, 5.38f, 17.63f, 5.3f, 15.7f, 6.41f)
                curveTo(15.42f, 6.57f, 15.16f, 6.76f, 14.92f, 6.95f)
                curveTo(14.97f, 6.64f, 15f, 6.32f, 15f, 6f)
                curveTo(15f, 3.78f, 13.79f, 1.85f, 12f, 0.81f)
                curveTo(10.21f, 1.85f, 9f, 3.78f, 9f, 6f)
                curveTo(9f, 6.32f, 9.03f, 6.64f, 9.08f, 6.95f)
                curveTo(8.84f, 6.75f, 8.58f, 6.56f, 8.3f, 6.4f)
                curveTo(6.38f, 5.29f, 4.1f, 5.37f, 2.3f, 6.4f)
                curveTo(2.3f, 8.47f, 3.37f, 10.5f, 5.3f, 11.59f)
                curveTo(5.58f, 11.75f, 5.87f, 11.88f, 6.16f, 12f)
                curveTo(5.87f, 12.1f, 5.58f, 12.23f, 5.3f, 12.39f)
                curveTo(3.38f, 13.5f, 2.31f, 15.5f, 2.3f, 17.58f)
                curveTo(4.09f, 18.61f, 6.37f, 18.69f, 8.3f, 17.58f)
                curveTo(8.58f, 17.42f, 8.84f, 17.23f, 9.08f, 17.04f)
                curveTo(9.03f, 17.36f, 9f, 17.68f, 9f, 18f)
                curveTo(9f, 20.22f, 10.21f, 22.15f, 12f, 23.19f)
                curveTo(13.79f, 22.15f, 15f, 20.22f, 15f, 18f)
                curveTo(15f, 17.68f, 14.97f, 17.36f, 14.92f, 17.05f)
                curveTo(15.16f, 17.25f, 15.42f, 17.43f, 15.7f, 17.59f)
                curveTo(17.62f, 18.7f, 19.9f, 18.62f, 21.7f, 17.59f)
                curveTo(21.69f, 15.5f, 20.62f, 13.5f, 18.7f, 12.4f)
                close()
            }
        }.build()

        return _ImageFilterVintage!!
    }

@Suppress("ObjectPropertyName")
private var _ImageFilterVintage: ImageVector? = null
