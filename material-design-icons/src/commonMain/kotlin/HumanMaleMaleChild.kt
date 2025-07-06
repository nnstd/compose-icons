package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanMaleMaleChild: ImageVector
    get() {
        if (_HumanMaleMaleChild != null) {
            return _HumanMaleMaleChild!!
        }
        _HumanMaleMaleChild = ImageVector.Builder(
            name = "HumanMaleMaleChild",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 11.5f)
                curveTo(13.3f, 11.5f, 14f, 10.8f, 14f, 10f)
                reflectiveCurveTo(13.3f, 8.5f, 12.5f, 8.5f)
                reflectiveCurveTo(11f, 9.2f, 11f, 10f)
                reflectiveCurveTo(11.7f, 11.5f, 12.5f, 11.5f)
                moveTo(5.5f, 6f)
                curveTo(6.6f, 6f, 7.5f, 5.1f, 7.5f, 4f)
                reflectiveCurveTo(6.6f, 2f, 5.5f, 2f)
                reflectiveCurveTo(3.5f, 2.9f, 3.5f, 4f)
                reflectiveCurveTo(4.4f, 6f, 5.5f, 6f)
                moveTo(7.5f, 22f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                curveTo(9f, 7.9f, 8.1f, 7f, 7f, 7f)
                horizontalLineTo(4f)
                curveTo(2.9f, 7f, 2f, 7.9f, 2f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(3.5f)
                verticalLineTo(22f)
                horizontalLineTo(7.5f)
                moveTo(14f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                curveTo(15f, 13.2f, 14.3f, 12.5f, 13.5f, 12.5f)
                horizontalLineTo(11.5f)
                curveTo(10.7f, 12.5f, 10f, 13.2f, 10f, 14f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                moveTo(18.5f, 6f)
                curveTo(19.6f, 6f, 20.5f, 5.1f, 20.5f, 4f)
                reflectiveCurveTo(19.6f, 2f, 18.5f, 2f)
                reflectiveCurveTo(16.5f, 2.9f, 16.5f, 4f)
                reflectiveCurveTo(17.4f, 6f, 18.5f, 6f)
                moveTo(22f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(20.5f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                curveTo(17f, 12.6f, 16.2f, 11.4f, 15f, 10.9f)
                verticalLineTo(9f)
                curveTo(15f, 7.9f, 15.9f, 7f, 17f, 7f)
                horizontalLineTo(20f)
                curveTo(21.1f, 7f, 22f, 7.9f, 22f, 9f)
                close()
            }
        }.build()

        return _HumanMaleMaleChild!!
    }

@Suppress("ObjectPropertyName")
private var _HumanMaleMaleChild: ImageVector? = null
