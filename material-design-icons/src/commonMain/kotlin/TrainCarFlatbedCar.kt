package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarFlatbedCar: ImageVector
    get() {
        if (_TrainCarFlatbedCar != null) {
            return _TrainCarFlatbedCar!!
        }
        _TrainCarFlatbedCar = ImageVector.Builder(
            name = "TrainCarFlatbedCar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13f)
                verticalLineTo(10f)
                curveTo(23f, 8.89f, 22.11f, 8f, 21f, 8f)
                horizontalLineTo(19f)
                lineTo(16f, 4f)
                horizontalLineTo(6f)
                lineTo(3f, 8f)
                curveTo(1.89f, 8f, 1f, 8.89f, 1f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                curveTo(3f, 13.77f, 3.3f, 14.47f, 3.78f, 15f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                curveTo(2f, 18.11f, 2.9f, 19f, 4f, 19f)
                reflectiveCurveTo(6f, 18.11f, 6f, 17f)
                horizontalLineTo(18f)
                curveTo(18f, 18.11f, 18.9f, 19f, 20f, 19f)
                reflectiveCurveTo(22f, 18.11f, 22f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                horizontalLineTo(20.22f)
                curveTo(20.7f, 14.47f, 21f, 13.77f, 21f, 13f)
                horizontalLineTo(23f)
                moveTo(19.5f, 13f)
                curveTo(19.5f, 13.83f, 18.83f, 14.5f, 18f, 14.5f)
                reflectiveCurveTo(16.5f, 13.83f, 16.5f, 13f)
                reflectiveCurveTo(17.17f, 11.5f, 18f, 11.5f)
                reflectiveCurveTo(19.5f, 12.17f, 19.5f, 13f)
                moveTo(12f, 5.5f)
                horizontalLineTo(15.25f)
                lineTo(17.14f, 8f)
                horizontalLineTo(12f)
                verticalLineTo(5.5f)
                moveTo(15.78f, 15f)
                horizontalLineTo(8.22f)
                curveTo(8.7f, 14.47f, 9f, 13.77f, 9f, 13f)
                horizontalLineTo(15f)
                curveTo(15f, 13.77f, 15.3f, 14.47f, 15.78f, 15f)
                moveTo(6.75f, 5.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(8f)
                horizontalLineTo(4.86f)
                lineTo(6.75f, 5.5f)
                moveTo(6f, 11.5f)
                curveTo(6.83f, 11.5f, 7.5f, 12.17f, 7.5f, 13f)
                reflectiveCurveTo(6.83f, 14.5f, 6f, 14.5f)
                reflectiveCurveTo(4.5f, 13.83f, 4.5f, 13f)
                reflectiveCurveTo(5.17f, 11.5f, 6f, 11.5f)
                close()
            }
        }.build()

        return _TrainCarFlatbedCar!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarFlatbedCar: ImageVector? = null
