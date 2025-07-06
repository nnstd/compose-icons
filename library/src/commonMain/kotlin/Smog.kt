package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Smog: ImageVector
    get() {
        if (_Smog != null) {
            return _Smog!!
        }
        _Smog = ImageVector.Builder(
            name = "Smog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(10.08f, 2f, 8.5f, 3.35f, 8.09f, 5.15f)
                curveTo(7.45f, 4.44f, 6.53f, 4f, 5.5f, 4f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7.5f)
                horizontalLineTo(2f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 11f)
                horizontalLineTo(6.68f)
                verticalLineTo(12f)
                horizontalLineTo(10.72f)
                verticalLineTo(11f)
                horizontalLineTo(13.28f)
                verticalLineTo(12f)
                horizontalLineTo(17.32f)
                verticalLineTo(11f)
                horizontalLineTo(18.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 7.5f)
                horizontalLineTo(22f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 4f)
                horizontalLineTo(18.5f)
                curveTo(17.47f, 4f, 16.55f, 4.44f, 15.91f, 5.15f)
                curveTo(15.5f, 3.35f, 13.92f, 2f, 12f, 2f)
                moveTo(7.2f, 14f)
                lineTo(6.4f, 22f)
                horizontalLineTo(11f)
                lineTo(10.2f, 14f)
                horizontalLineTo(7.2f)
                moveTo(13.8f, 14f)
                lineTo(13f, 22f)
                horizontalLineTo(17.6f)
                lineTo(16.8f, 14f)
                horizontalLineTo(13.8f)
                close()
            }
        }.build()

        return _Smog!!
    }

@Suppress("ObjectPropertyName")
private var _Smog: ImageVector? = null
