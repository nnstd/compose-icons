package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlaneCar: ImageVector
    get() {
        if (_PlaneCar != null) {
            return _PlaneCar!!
        }
        _PlaneCar = ImageVector.Builder(
            name = "PlaneCar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.57f, 12.66f)
                curveTo(21.43f, 12.26f, 21.05f, 12f, 20.6f, 12f)
                horizontalLineTo(13.41f)
                curveTo(12.95f, 12f, 12.58f, 12.26f, 12.43f, 12.66f)
                lineTo(11f, 16.77f)
                verticalLineTo(22.28f)
                curveTo(11f, 22.66f, 11.32f, 23f, 11.7f, 23f)
                horizontalLineTo(12.32f)
                curveTo(12.7f, 23f, 13f, 22.62f, 13f, 22.24f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(22.24f)
                curveTo(21f, 22.62f, 21.31f, 23f, 21.69f, 23f)
                horizontalLineTo(22.3f)
                curveTo(22.68f, 23f, 23f, 22.66f, 23f, 22.28f)
                verticalLineTo(16.77f)
                lineTo(21.57f, 12.66f)
                moveTo(13.41f, 13f)
                horizontalLineTo(20.6f)
                lineTo(21.63f, 16f)
                horizontalLineTo(12.38f)
                lineTo(13.41f, 13f)
                moveTo(13f, 19f)
                curveTo(12.45f, 19f, 12f, 18.55f, 12f, 18f)
                reflectiveCurveTo(12.45f, 17f, 13f, 17f)
                reflectiveCurveTo(14f, 17.45f, 14f, 18f)
                reflectiveCurveTo(13.55f, 19f, 13f, 19f)
                moveTo(21f, 19f)
                curveTo(20.45f, 19f, 20f, 18.55f, 20f, 18f)
                reflectiveCurveTo(20.45f, 17f, 21f, 17f)
                reflectiveCurveTo(22f, 17.45f, 22f, 18f)
                reflectiveCurveTo(21.55f, 19f, 21f, 19f)
                moveTo(6.66f, 14.53f)
                lineTo(7f, 17f)
                lineTo(5.95f, 18.06f)
                lineTo(4.19f, 14.88f)
                lineTo(1f, 13.11f)
                lineTo(2.06f, 12.03f)
                lineTo(4.56f, 12.4f)
                lineTo(8.43f, 8.53f)
                lineTo(1f, 4.62f)
                lineTo(2.42f, 3.21f)
                lineTo(11.61f, 5.33f)
                lineTo(15.5f, 1.44f)
                curveTo(16.06f, 0.855f, 17.06f, 0.855f, 17.62f, 1.44f)
                curveTo(18.21f, 2.03f, 18.21f, 3f, 17.62f, 3.56f)
                lineTo(13.73f, 7.45f)
                lineTo(14.55f, 11f)
                horizontalLineTo(13.41f)
                curveTo(12.54f, 11f, 11.79f, 11.5f, 11.5f, 12.31f)
                lineTo(11.47f, 12.37f)
                lineTo(10.56f, 10.63f)
                lineTo(6.66f, 14.53f)
                close()
            }
        }.build()

        return _PlaneCar!!
    }

@Suppress("ObjectPropertyName")
private var _PlaneCar: ImageVector? = null
