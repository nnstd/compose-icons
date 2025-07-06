package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanMaleFemaleChild: ImageVector
    get() {
        if (_HumanMaleFemaleChild != null) {
            return _HumanMaleFemaleChild!!
        }
        _HumanMaleFemaleChild = ImageVector.Builder(
            name = "HumanMaleFemaleChild",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 4f)
                curveTo(16f, 2.9f, 16.9f, 2f, 18f, 2f)
                reflectiveCurveTo(20f, 2.9f, 20f, 4f)
                reflectiveCurveTo(19.1f, 6f, 18f, 6f)
                reflectiveCurveTo(16f, 5.1f, 16f, 4f)
                moveTo(20f, 22f)
                verticalLineTo(16f)
                horizontalLineTo(22.5f)
                lineTo(20f, 8.4f)
                curveTo(19.7f, 7.6f, 19f, 7f, 18.1f, 7f)
                horizontalLineTo(18f)
                curveTo(17.1f, 7f, 16.4f, 7.6f, 16.1f, 8.4f)
                lineTo(15.2f, 11f)
                curveTo(16.3f, 11.6f, 17f, 12.7f, 17f, 14.1f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
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
                close()
            }
        }.build()

        return _HumanMaleFemaleChild!!
    }

@Suppress("ObjectPropertyName")
private var _HumanMaleFemaleChild: ImageVector? = null
