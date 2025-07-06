package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PotMixOutline: ImageVector
    get() {
        if (_PotMixOutline != null) {
            return _PotMixOutline!!
        }
        _PotMixOutline = ImageVector.Builder(
            name = "PotMixOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.6f, 9f)
                lineTo(18f, 3.1f)
                lineTo(19.7f, 4.1f)
                lineTo(16.9f, 9f)
                horizontalLineTo(14.6f)
                moveTo(16.3f, 10f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                curveTo(19f, 20.1f, 18.1f, 21f, 17f, 21f)
                horizontalLineTo(7f)
                curveTo(5.9f, 21f, 5f, 20.1f, 5f, 19f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(16.3f)
                moveTo(17f, 12f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _PotMixOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PotMixOutline: ImageVector? = null
