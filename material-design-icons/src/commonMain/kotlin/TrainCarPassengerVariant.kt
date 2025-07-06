package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarPassengerVariant: ImageVector
    get() {
        if (_TrainCarPassengerVariant != null) {
            return _TrainCarPassengerVariant!!
        }
        _TrainCarPassengerVariant = ImageVector.Builder(
            name = "TrainCarPassengerVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                curveTo(1.9f, 7f, 1f, 7.9f, 1f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                curveTo(2f, 18.11f, 2.9f, 19f, 4f, 19f)
                reflectiveCurveTo(6f, 18.11f, 6f, 17f)
                horizontalLineTo(18f)
                curveTo(18f, 18.11f, 18.9f, 19f, 20f, 19f)
                reflectiveCurveTo(22f, 18.11f, 22f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                curveTo(23f, 7.9f, 22.11f, 7f, 21f, 7f)
                moveTo(11f, 12f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                moveTo(21f, 12f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _TrainCarPassengerVariant!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarPassengerVariant: ImageVector? = null
