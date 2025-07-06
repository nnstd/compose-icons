package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RollerShade: ImageVector
    get() {
        if (_RollerShade != null) {
            return _RollerShade!!
        }
        _RollerShade = ImageVector.Builder(
            name = "RollerShade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                moveTo(6f, 19f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(14.8f)
                curveTo(10.6f, 15.1f, 10.2f, 15.6f, 10.2f, 16.2f)
                curveTo(10.2f, 17.2f, 11f, 18f, 12f, 18f)
                reflectiveCurveTo(13.8f, 17.2f, 13.8f, 16.2f)
                curveTo(13.8f, 15.6f, 13.5f, 15.1f, 13f, 14.8f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _RollerShade!!
    }

@Suppress("ObjectPropertyName")
private var _RollerShade: ImageVector? = null
