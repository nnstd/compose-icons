package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Earth: ImageVector
    get() {
        if (_Earth != null) {
            return _Earth!!
        }
        _Earth = ImageVector.Builder(
            name = "Earth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.9f, 17.39f)
                curveTo(17.64f, 16.59f, 16.89f, 16f, 16f, 16f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 5f)
                verticalLineTo(4.59f)
                curveTo(17.93f, 5.77f, 20f, 8.64f, 20f, 12f)
                curveTo(20f, 14.08f, 19.2f, 15.97f, 17.9f, 17.39f)
                moveTo(11f, 19.93f)
                curveTo(7.05f, 19.44f, 4f, 16.08f, 4f, 12f)
                curveTo(4f, 11.38f, 4.08f, 10.78f, 4.21f, 10.21f)
                lineTo(9f, 15f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 18f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
        }.build()

        return _Earth!!
    }

@Suppress("ObjectPropertyName")
private var _Earth: ImageVector? = null
