package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArmFlex: ImageVector
    get() {
        if (_ArmFlex != null) {
            return _ArmFlex!!
        }
        _ArmFlex = ImageVector.Builder(
            name = "ArmFlex",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 18.34f)
                curveTo(3f, 18.34f, 4f, 7.09f, 7f, 3f)
                lineTo(12f, 4f)
                lineTo(11f, 7.09f)
                horizontalLineTo(9f)
                verticalLineTo(14.25f)
                horizontalLineTo(10f)
                curveTo(12f, 11.18f, 16.14f, 10.06f, 18.64f, 11.18f)
                curveTo(21.94f, 12.71f, 21.64f, 17.32f, 18.64f, 19.36f)
                curveTo(16.24f, 21f, 9f, 22.43f, 3f, 18.34f)
                close()
            }
        }.build()

        return _ArmFlex!!
    }

@Suppress("ObjectPropertyName")
private var _ArmFlex: ImageVector? = null
