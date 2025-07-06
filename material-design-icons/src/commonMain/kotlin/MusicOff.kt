package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicOff: ImageVector
    get() {
        if (_MusicOff != null) {
            return _MusicOff!!
        }
        _MusicOff = ImageVector.Builder(
            name = "MusicOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(9f, 12.27f)
                verticalLineTo(17.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 21f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 14f)
                curveTo(6.04f, 14f, 6.55f, 14.12f, 7f, 14.34f)
                verticalLineTo(10.27f)
                lineTo(2f, 5.27f)
                moveTo(21f, 3f)
                verticalLineTo(15.5f)
                curveTo(21f, 16.5f, 20.57f, 17.42f, 19.88f, 18.06f)
                lineTo(14.94f, 13.12f)
                curveTo(15.58f, 12.43f, 16.5f, 12f, 17.5f, 12f)
                curveTo(18.04f, 12f, 18.55f, 12.12f, 19f, 12.34f)
                verticalLineTo(6.47f)
                lineTo(10.17f, 8.35f)
                lineTo(7.66f, 5.84f)
                lineTo(21f, 3f)
                close()
            }
        }.build()

        return _MusicOff!!
    }

@Suppress("ObjectPropertyName")
private var _MusicOff: ImageVector? = null
