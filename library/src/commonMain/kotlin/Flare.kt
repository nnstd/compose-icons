package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Flare: ImageVector
    get() {
        if (_Flare != null) {
            return _Flare!!
        }
        _Flare = ImageVector.Builder(
            name = "Flare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(9.17f, 7.76f)
                lineTo(7.05f, 5.64f)
                lineTo(5.64f, 7.05f)
                lineTo(7.76f, 9.17f)
                lineTo(9.17f, 7.76f)
                moveTo(13f, 1f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                moveTo(18.36f, 7.05f)
                lineTo(16.95f, 5.64f)
                lineTo(14.83f, 7.76f)
                lineTo(16.24f, 9.17f)
                lineTo(18.36f, 7.05f)
                moveTo(17f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                moveTo(14.83f, 16.24f)
                lineTo(16.95f, 18.36f)
                lineTo(18.36f, 16.95f)
                lineTo(16.24f, 14.83f)
                lineTo(14.83f, 16.24f)
                moveTo(5.64f, 16.95f)
                lineTo(7.05f, 18.36f)
                lineTo(9.17f, 16.24f)
                lineTo(7.76f, 14.83f)
                lineTo(5.64f, 16.95f)
                moveTo(11f, 23f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(23f)
                close()
            }
        }.build()

        return _Flare!!
    }

@Suppress("ObjectPropertyName")
private var _Flare: ImageVector? = null
