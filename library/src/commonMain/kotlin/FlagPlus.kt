package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagPlus: ImageVector
    get() {
        if (_FlagPlus != null) {
            return _FlagPlus!!
        }
        _FlagPlus = ImageVector.Builder(
            name = "FlagPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                moveTo(12.4f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                curveTo(15.78f, 12f, 13.84f, 13.21f, 12.8f, 15f)
                horizontalLineTo(11f)
                lineTo(10.6f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                lineTo(12.4f, 5f)
                close()
            }
        }.build()

        return _FlagPlus!!
    }

@Suppress("ObjectPropertyName")
private var _FlagPlus: ImageVector? = null
