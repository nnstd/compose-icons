package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeightGram: ImageVector
    get() {
        if (_WeightGram != null) {
            return _WeightGram!!
        }
        _WeightGram = ImageVector.Builder(
            name = "WeightGram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.95f, 10.56f)
                curveTo(19.75f, 9.67f, 18.95f, 9f, 18f, 9f)
                horizontalLineTo(15.46f)
                curveTo(15.81f, 8.41f, 16f, 7.73f, 16f, 7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 7f)
                curveTo(8f, 7.73f, 8.19f, 8.41f, 8.54f, 9f)
                horizontalLineTo(6f)
                curveTo(5.05f, 9f, 4.25f, 9.67f, 4.05f, 10.56f)
                curveTo(2.04f, 18.57f, 2f, 18.78f, 2f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 19f)
                curveTo(22f, 18.78f, 21.96f, 18.57f, 19.95f, 10.56f)
                moveTo(12f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                moveTo(15f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                curveTo(9.89f, 19f, 9f, 18.11f, 9f, 17f)
                verticalLineTo(13f)
                curveTo(9f, 11.89f, 9.89f, 11f, 11f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _WeightGram!!
    }

@Suppress("ObjectPropertyName")
private var _WeightGram: ImageVector? = null
