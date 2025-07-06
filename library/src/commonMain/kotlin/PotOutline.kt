package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PotOutline: ImageVector
    get() {
        if (_PotOutline != null) {
            return _PotOutline!!
        }
        _PotOutline = ImageVector.Builder(
            name = "PotOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                curveTo(5f, 20.1f, 5.9f, 21f, 7f, 21f)
                horizontalLineTo(17f)
                curveTo(18.1f, 21f, 19f, 20.1f, 19f, 19f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                moveTo(7f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _PotOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PotOutline: ImageVector? = null
