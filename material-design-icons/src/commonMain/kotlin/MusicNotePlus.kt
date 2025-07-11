package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNotePlus: ImageVector
    get() {
        if (_MusicNotePlus != null) {
            return _MusicNotePlus!!
        }
        _MusicNotePlus = ImageVector.Builder(
            name = "MusicNotePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                moveTo(9f, 3f)
                verticalLineTo(13.55f)
                curveTo(8.41f, 13.21f, 7.73f, 13f, 7f, 13f)
                curveTo(4.79f, 13f, 3f, 14.79f, 3f, 17f)
                reflectiveCurveTo(4.79f, 21f, 7f, 21f)
                reflectiveCurveTo(11f, 19.21f, 11f, 17f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _MusicNotePlus!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNotePlus: ImageVector? = null
