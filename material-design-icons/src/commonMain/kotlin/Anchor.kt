package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Anchor: ImageVector
    get() {
        if (_Anchor != null) {
            return _Anchor!!
        }
        _Anchor = ImageVector.Builder(
            name = "Anchor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7.83f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(19.92f)
                curveTo(10.26f, 19.79f, 9.5f, 19.58f, 8.79f, 19.27f)
                curveTo(8.05f, 18.95f, 7.4f, 18.56f, 6.82f, 18.09f)
                curveTo(6.24f, 17.62f, 5.78f, 17.11f, 5.44f, 16.55f)
                lineTo(7f, 15f)
                lineTo(3f, 12f)
                verticalLineTo(15f)
                curveTo(3f, 15.97f, 3.27f, 16.88f, 3.82f, 17.72f)
                curveTo(4.37f, 18.56f, 5.09f, 19.31f, 6f, 19.95f)
                curveTo(6.87f, 20.59f, 7.84f, 21.09f, 8.88f, 21.45f)
                curveTo(9.93f, 21.81f, 10.97f, 22f, 12f, 22f)
                curveTo(13.03f, 22f, 14.07f, 21.8f, 15.12f, 21.44f)
                curveTo(16.16f, 21.08f, 17.13f, 20.58f, 18f, 19.95f)
                curveTo(18.92f, 19.31f, 19.63f, 18.57f, 20.18f, 17.72f)
                curveTo(20.73f, 16.88f, 21f, 15.97f, 21f, 15f)
                verticalLineTo(12f)
                lineTo(17f, 15f)
                lineTo(18.56f, 16.55f)
                curveTo(18.22f, 17.11f, 17.76f, 17.62f, 17.18f, 18.09f)
                curveTo(16.6f, 18.56f, 15.95f, 18.95f, 15.21f, 19.27f)
                curveTo(14.5f, 19.58f, 13.74f, 19.79f, 13f, 19.92f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7.82f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                close()
            }
        }.build()

        return _Anchor!!
    }

@Suppress("ObjectPropertyName")
private var _Anchor: ImageVector? = null
