package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FrequentlyAskedQuestions: ImageVector
    get() {
        if (_FrequentlyAskedQuestions != null) {
            return _FrequentlyAskedQuestions!!
        }
        _FrequentlyAskedQuestions = ImageVector.Builder(
            name = "FrequentlyAskedQuestions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 15f)
                horizontalLineTo(6f)
                lineTo(2f, 19f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 3f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15f)
                moveTo(23f, 9f)
                verticalLineTo(23f)
                lineTo(19f, 19f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 18f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 9f)
                moveTo(8.19f, 4f)
                curveTo(7.32f, 4f, 6.62f, 4.2f, 6.08f, 4.59f)
                curveTo(5.56f, 5f, 5.3f, 5.57f, 5.31f, 6.36f)
                lineTo(5.32f, 6.39f)
                horizontalLineTo(7.25f)
                curveTo(7.26f, 6.09f, 7.35f, 5.86f, 7.53f, 5.7f)
                curveTo(7.71f, 5.55f, 7.93f, 5.47f, 8.19f, 5.47f)
                curveTo(8.5f, 5.47f, 8.76f, 5.57f, 8.94f, 5.75f)
                curveTo(9.12f, 5.94f, 9.2f, 6.2f, 9.2f, 6.5f)
                curveTo(9.2f, 6.82f, 9.13f, 7.09f, 8.97f, 7.32f)
                curveTo(8.83f, 7.55f, 8.62f, 7.75f, 8.36f, 7.91f)
                curveTo(7.85f, 8.25f, 7.5f, 8.55f, 7.31f, 8.82f)
                curveTo(7.11f, 9.08f, 7f, 9.5f, 7f, 10f)
                horizontalLineTo(9f)
                curveTo(9f, 9.69f, 9.04f, 9.44f, 9.13f, 9.26f)
                curveTo(9.22f, 9.08f, 9.39f, 8.9f, 9.64f, 8.74f)
                curveTo(10.09f, 8.5f, 10.46f, 8.21f, 10.75f, 7.81f)
                curveTo(11.04f, 7.41f, 11.19f, 7f, 11.19f, 6.5f)
                curveTo(11.19f, 5.74f, 10.92f, 5.13f, 10.38f, 4.68f)
                curveTo(9.85f, 4.23f, 9.12f, 4f, 8.19f, 4f)
                moveTo(7f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                moveTo(13f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                moveTo(13f, 4f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _FrequentlyAskedQuestions!!
    }

@Suppress("ObjectPropertyName")
private var _FrequentlyAskedQuestions: ImageVector? = null
