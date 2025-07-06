package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Gondola: ImageVector
    get() {
        if (_Gondola != null) {
            return _Gondola!!
        }
        _Gondola = ImageVector.Builder(
            name = "Gondola",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(7.59f)
                lineTo(22.12f, 6.07f)
                lineTo(21.88f, 4.59f)
                lineTo(16.41f, 5.5f)
                curveTo(16.46f, 5.35f, 16.5f, 5.18f, 16.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 5f)
                curveTo(13.5f, 5.35f, 13.63f, 5.68f, 13.84f, 5.93f)
                lineTo(13f, 6.07f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(6.41f)
                lineTo(10.41f, 6.5f)
                curveTo(10.46f, 6.35f, 10.5f, 6.18f, 10.5f, 6f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 4.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 6f)
                curveTo(7.5f, 6.36f, 7.63f, 6.68f, 7.83f, 6.93f)
                lineTo(1.88f, 7.93f)
                lineTo(2.12f, 9.41f)
                lineTo(11f, 7.93f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                curveTo(4.89f, 10f, 4f, 10.9f, 4f, 12f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 18f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 10f)
                moveTo(6f, 12f)
                horizontalLineTo(8.25f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                moveTo(9.75f, 16f)
                verticalLineTo(12f)
                horizontalLineTo(14.25f)
                verticalLineTo(16f)
                horizontalLineTo(9.75f)
                moveTo(18f, 16f)
                horizontalLineTo(15.75f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _Gondola!!
    }

@Suppress("ObjectPropertyName")
private var _Gondola: ImageVector? = null
