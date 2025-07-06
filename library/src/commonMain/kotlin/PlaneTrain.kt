package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlaneTrain: ImageVector
    get() {
        if (_PlaneTrain != null) {
            return _PlaneTrain!!
        }
        _PlaneTrain = ImageVector.Builder(
            name = "PlaneTrain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                horizontalLineTo(14f)
                curveTo(12.34f, 8f, 11f, 9.34f, 11f, 11f)
                verticalLineTo(18f)
                curveTo(11f, 19.66f, 12.34f, 21f, 14f, 21f)
                lineTo(13f, 22f)
                verticalLineTo(23f)
                horizontalLineTo(14f)
                lineTo(16f, 20.97f)
                horizontalLineTo(18f)
                lineTo(20f, 23f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                lineTo(20f, 21f)
                curveTo(21.66f, 21f, 23f, 19.66f, 23f, 18f)
                verticalLineTo(11f)
                curveTo(23f, 9.34f, 21.66f, 8f, 20f, 8f)
                moveTo(14f, 19f)
                curveTo(13.45f, 19f, 13f, 18.55f, 13f, 18f)
                reflectiveCurveTo(13.45f, 17f, 14f, 17f)
                reflectiveCurveTo(15f, 17.45f, 15f, 18f)
                reflectiveCurveTo(14.55f, 19f, 14f, 19f)
                moveTo(20f, 19f)
                curveTo(19.45f, 19f, 19f, 18.55f, 19f, 18f)
                reflectiveCurveTo(19.45f, 17f, 20f, 17f)
                reflectiveCurveTo(21f, 17.45f, 21f, 18f)
                reflectiveCurveTo(20.55f, 19f, 20f, 19f)
                moveTo(21f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
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
                lineTo(14.18f, 7f)
                horizontalLineTo(14f)
                curveTo(11.79f, 7f, 10f, 8.79f, 10f, 11f)
                verticalLineTo(11.19f)
                lineTo(6.66f, 14.53f)
                close()
            }
        }.build()

        return _PlaneTrain!!
    }

@Suppress("ObjectPropertyName")
private var _PlaneTrain: ImageVector? = null
