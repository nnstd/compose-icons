package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RollerShadeClosed: ImageVector
    get() {
        if (_RollerShadeClosed != null) {
            return _RollerShadeClosed!!
        }
        _RollerShadeClosed = ImageVector.Builder(
            name = "RollerShadeClosed",
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
                horizontalLineTo(10.25f)
                curveTo(10.25f, 21.97f, 11.03f, 22.75f, 12f, 22.75f)
                reflectiveCurveTo(13.75f, 21.97f, 13.75f, 21f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                moveTo(6f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                moveTo(13f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _RollerShadeClosed!!
    }

@Suppress("ObjectPropertyName")
private var _RollerShadeClosed: ImageVector? = null
