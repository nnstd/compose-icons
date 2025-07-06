package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Projector: ImageVector
    get() {
        if (_Projector != null) {
            return _Projector!!
        }
        _Projector = ImageVector.Builder(
            name = "Projector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 6f)
                curveTo(14.87f, 6f, 13.77f, 6.35f, 12.84f, 7f)
                horizontalLineTo(4f)
                curveTo(2.89f, 7f, 2f, 7.89f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 16.11f, 2.89f, 17f, 4f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 19f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 18f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 19f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                curveTo(21.11f, 17f, 22f, 16.11f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 7.89f, 21.11f, 7f, 20f, 7f)
                horizontalLineTo(19.15f)
                curveTo(18.23f, 6.35f, 17.13f, 6f, 16f, 6f)
                moveTo(16f, 7.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 11f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 14.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 11f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 7.5f)
                moveTo(4f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                moveTo(16f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 9f)
                moveTo(4f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                moveTo(4f, 13f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Projector!!
    }

@Suppress("ObjectPropertyName")
private var _Projector: ImageVector? = null
