package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCar: ImageVector
    get() {
        if (_TrainCar != null) {
            return _TrainCar!!
        }
        _TrainCar = ImageVector.Builder(
            name = "TrainCar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                verticalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 18f)
                lineTo(4f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                lineTo(7f, 17.97f)
                lineTo(9f, 18f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                moveTo(5f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 14f)
                moveTo(20.57f, 9.66f)
                curveTo(20.43f, 9.26f, 20.05f, 9f, 19.6f, 9f)
                horizontalLineTo(12.41f)
                curveTo(11.95f, 9f, 11.58f, 9.26f, 11.43f, 9.66f)
                lineTo(10f, 13.77f)
                verticalLineTo(19.28f)
                curveTo(10f, 19.66f, 10.32f, 20f, 10.7f, 20f)
                horizontalLineTo(11.32f)
                curveTo(11.7f, 20f, 12f, 19.62f, 12f, 19.24f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(19.24f)
                curveTo(20f, 19.62f, 20.31f, 20f, 20.69f, 20f)
                horizontalLineTo(21.3f)
                curveTo(21.68f, 20f, 22f, 19.66f, 22f, 19.28f)
                verticalLineTo(17.91f)
                lineTo(22f, 13.77f)
                lineTo(20.57f, 9.66f)
                moveTo(12.41f, 10f)
                horizontalLineTo(19.6f)
                lineTo(20.63f, 13f)
                horizontalLineTo(11.38f)
                lineTo(12.41f, 10f)
                moveTo(12f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                moveTo(20f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 16f)
                close()
            }
        }.build()

        return _TrainCar!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCar: ImageVector? = null
