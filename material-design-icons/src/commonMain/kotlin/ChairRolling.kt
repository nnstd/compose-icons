package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChairRolling: ImageVector
    get() {
        if (_ChairRolling != null) {
            return _ChairRolling!!
        }
        _ChairRolling = ImageVector.Builder(
            name = "ChairRolling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                moveTo(2f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                moveTo(17f, 5f)
                curveTo(17f, 3.9f, 16.1f, 3f, 15f, 3f)
                horizontalLineTo(9f)
                curveTo(7.9f, 3f, 7f, 3.9f, 7f, 5f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                moveTo(7f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                lineTo(7f, 22f)
                horizontalLineTo(9.8f)
                lineTo(12f, 19.8f)
                lineTo(14.2f, 22f)
                horizontalLineTo(17f)
                lineTo(13f, 18f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _ChairRolling!!
    }

@Suppress("ObjectPropertyName")
private var _ChairRolling: ImageVector? = null
