package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Owl: ImageVector
    get() {
        if (_Owl != null) {
            return _Owl!!
        }
        _Owl = ImageVector.Builder(
            name = "Owl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                curveTo(12.56f, 16.84f, 13.31f, 17.53f, 14.2f, 18f)
                lineTo(12f, 20.2f)
                lineTo(9.8f, 18f)
                curveTo(10.69f, 17.53f, 11.45f, 16.84f, 12f, 16f)
                moveTo(17f, 11.2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 13.2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 15.2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 13.2f)
                curveTo(19f, 12.09f, 18.1f, 11.2f, 17f, 11.2f)
                moveTo(7f, 11.2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 13.2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 15.2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13.2f)
                curveTo(9f, 12.09f, 8.1f, 11.2f, 7f, 11.2f)
                moveTo(17f, 8.7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12.7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 16.7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 12.7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 8.7f)
                moveTo(7f, 8.7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12.7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 16.7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12.7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8.7f)
                moveTo(2.24f, 1f)
                curveTo(4f, 4.7f, 2.73f, 7.46f, 1.55f, 10.2f)
                curveTo(1.19f, 11f, 1f, 11.83f, 1f, 12.7f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18.7f)
                curveTo(7.21f, 18.69f, 7.42f, 18.68f, 7.63f, 18.65f)
                lineTo(10.59f, 21.61f)
                lineTo(12f, 23f)
                lineTo(13.41f, 21.61f)
                lineTo(16.37f, 18.65f)
                curveTo(16.58f, 18.68f, 16.79f, 18.69f, 17f, 18.7f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 12.7f)
                curveTo(23f, 11.83f, 22.81f, 11f, 22.45f, 10.2f)
                curveTo(21.27f, 7.46f, 20f, 4.7f, 21.76f, 1f)
                curveTo(19.12f, 3.06f, 15.36f, 4.69f, 12f, 4.7f)
                curveTo(8.64f, 4.69f, 4.88f, 3.06f, 2.24f, 1f)
                close()
            }
        }.build()

        return _Owl!!
    }

@Suppress("ObjectPropertyName")
private var _Owl: ImageVector? = null
