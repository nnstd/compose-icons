package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarFourPointsBox: ImageVector
    get() {
        if (_StarFourPointsBox != null) {
            return _StarFourPointsBox!!
        }
        _StarFourPointsBox = ImageVector.Builder(
            name = "StarFourPointsBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 19.53f, 20.79f, 20.04f, 20.41f, 20.41f)
                curveTo(20.04f, 20.79f, 19.53f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(4.47f, 21f, 3.96f, 20.79f, 3.59f, 20.41f)
                curveTo(3.21f, 20.04f, 3f, 19.53f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                moveTo(12f, 17f)
                lineTo(13.56f, 13.58f)
                lineTo(17f, 12f)
                lineTo(13.56f, 10.44f)
                lineTo(12f, 7f)
                lineTo(10.43f, 10.44f)
                lineTo(7f, 12f)
                lineTo(10.43f, 13.58f)
                lineTo(12f, 17f)
                close()
            }
        }.build()

        return _StarFourPointsBox!!
    }

@Suppress("ObjectPropertyName")
private var _StarFourPointsBox: ImageVector? = null
