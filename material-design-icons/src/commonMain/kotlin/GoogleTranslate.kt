package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleTranslate: ImageVector
    get() {
        if (_GoogleTranslate != null) {
            return _GoogleTranslate!!
        }
        _GoogleTranslate = ImageVector.Builder(
            name = "GoogleTranslate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 5f)
                horizontalLineTo(10.88f)
                lineTo(10f, 2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19f)
                horizontalLineTo(11f)
                lineTo(12f, 22f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 5f)
                moveTo(7.17f, 14.59f)
                arcTo(4.09f, 4.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.08f, 10.5f)
                arcTo(4.09f, 4.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.17f, 6.41f)
                curveTo(8.21f, 6.41f, 9.16f, 6.78f, 9.91f, 7.5f)
                lineTo(10f, 7.54f)
                lineTo(8.75f, 8.72f)
                lineTo(8.69f, 8.67f)
                curveTo(8.4f, 8.4f, 7.91f, 8.08f, 7.17f, 8.08f)
                curveTo(5.86f, 8.08f, 4.79f, 9.17f, 4.79f, 10.5f)
                curveTo(4.79f, 11.83f, 5.86f, 12.92f, 7.17f, 12.92f)
                curveTo(8.54f, 12.92f, 9.13f, 12.05f, 9.29f, 11.46f)
                horizontalLineTo(7.08f)
                verticalLineTo(9.91f)
                horizontalLineTo(11.03f)
                lineTo(11.04f, 10f)
                curveTo(11.08f, 10.19f, 11.09f, 10.38f, 11.09f, 10.59f)
                curveTo(11.09f, 12.94f, 9.5f, 14.59f, 7.17f, 14.59f)
                moveTo(13.2f, 12.88f)
                curveTo(13.53f, 13.5f, 13.94f, 14.06f, 14.39f, 14.58f)
                lineTo(13.85f, 15.11f)
                lineTo(13.2f, 12.88f)
                moveTo(13.97f, 12.12f)
                horizontalLineTo(13f)
                lineTo(12.67f, 11.08f)
                horizontalLineTo(16.66f)
                curveTo(16.66f, 11.08f, 16.32f, 12.39f, 15.1f, 13.82f)
                curveTo(14.58f, 13.2f, 14.21f, 12.59f, 13.97f, 12.12f)
                moveTo(21f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 21f)
                horizontalLineTo(13f)
                lineTo(15f, 19f)
                lineTo(14.19f, 16.23f)
                lineTo(15.11f, 15.31f)
                lineTo(17.79f, 18f)
                lineTo(18.5f, 17.27f)
                lineTo(15.81f, 14.59f)
                curveTo(16.71f, 13.56f, 17.41f, 12.34f, 17.73f, 11.08f)
                horizontalLineTo(19f)
                verticalLineTo(10.04f)
                horizontalLineTo(15.36f)
                verticalLineTo(9f)
                horizontalLineTo(14.32f)
                verticalLineTo(10.04f)
                horizontalLineTo(12.36f)
                lineTo(11.18f, 6f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 7f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _GoogleTranslate!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleTranslate: ImageVector? = null
