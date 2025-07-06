package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SpaceInvaders: ImageVector
    get() {
        if (_SpaceInvaders != null) {
            return _SpaceInvaders!!
        }
        _SpaceInvaders = ImageVector.Builder(
            name = "SpaceInvaders",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 6f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                moveTo(17f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                moveTo(23f, 12f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(1f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                horizontalLineTo(23f)
                moveTo(15f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                moveTo(7f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                moveTo(11f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                moveTo(17f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _SpaceInvaders!!
    }

@Suppress("ObjectPropertyName")
private var _SpaceInvaders: ImageVector? = null
