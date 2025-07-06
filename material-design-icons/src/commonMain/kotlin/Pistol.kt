package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pistol: ImageVector
    get() {
        if (_Pistol != null) {
            return _Pistol!!
        }
        _Pistol = ImageVector.Builder(
            name = "Pistol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 14f)
                horizontalLineTo(9.62f)
                curveTo(9.24f, 14f, 8.89f, 14.22f, 8.72f, 14.56f)
                lineTo(6.27f, 19.45f)
                curveTo(6.1f, 19.79f, 5.76f, 20f, 5.38f, 20f)
                horizontalLineTo(2f)
                curveTo(2f, 20f, -1f, 20f, 3f, 14f)
                curveTo(3f, 14f, 6f, 10f, 2f, 10f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                lineTo(3.5f, 4f)
                horizontalLineTo(6.5f)
                lineTo(7f, 5f)
                moveTo(14f, 12f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 10f)
                horizontalLineTo(12f)
                curveTo(12f, 10f, 11f, 11f, 12f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11f)
                verticalLineTo(12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 13f)
                horizontalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                close()
            }
        }.build()

        return _Pistol!!
    }

@Suppress("ObjectPropertyName")
private var _Pistol: ImageVector? = null
