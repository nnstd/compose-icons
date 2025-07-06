package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarFlatbedTank: ImageVector
    get() {
        if (_TrainCarFlatbedTank != null) {
            return _TrainCarFlatbedTank!!
        }
        _TrainCarFlatbedTank = ImageVector.Builder(
            name = "TrainCarFlatbedTank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.22f, 15f)
                curveTo(21.7f, 14.47f, 22f, 13.77f, 22f, 13f)
                curveTo(22f, 11.34f, 20.66f, 10f, 19f, 10f)
                horizontalLineTo(5f)
                curveTo(3.34f, 10f, 2f, 11.34f, 2f, 13f)
                curveTo(2f, 13.77f, 2.3f, 14.47f, 2.78f, 15f)
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
                horizontalLineTo(21.22f)
                moveTo(19f, 12f)
                curveTo(19.55f, 12f, 20f, 12.45f, 20f, 13f)
                reflectiveCurveTo(19.55f, 14f, 19f, 14f)
                reflectiveCurveTo(18f, 13.55f, 18f, 13f)
                reflectiveCurveTo(18.45f, 12f, 19f, 12f)
                moveTo(12f, 12f)
                curveTo(12.55f, 12f, 13f, 12.45f, 13f, 13f)
                reflectiveCurveTo(12.55f, 14f, 12f, 14f)
                reflectiveCurveTo(11f, 13.55f, 11f, 13f)
                reflectiveCurveTo(11.45f, 12f, 12f, 12f)
                moveTo(5f, 12f)
                curveTo(5.55f, 12f, 6f, 12.45f, 6f, 13f)
                reflectiveCurveTo(5.55f, 14f, 5f, 14f)
                reflectiveCurveTo(4f, 13.55f, 4f, 13f)
                reflectiveCurveTo(4.45f, 12f, 5f, 12f)
                moveTo(13.62f, 6f)
                lineTo(13.22f, 4f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(13.62f)
                moveTo(20f, 9f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                lineTo(7f, 3f)
                horizontalLineTo(12f)
                lineTo(13f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _TrainCarFlatbedTank!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarFlatbedTank: ImageVector? = null
