package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteSixteenth: ImageVector
    get() {
        if (_MusicNoteSixteenth != null) {
            return _MusicNoteSixteenth!!
        }
        _MusicNoteSixteenth = ImageVector.Builder(
            name = "MusicNoteSixteenth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                verticalLineTo(13.55f)
                curveTo(11.41f, 13.21f, 10.73f, 13f, 10f, 13f)
                curveTo(7.79f, 13f, 6f, 14.79f, 6f, 17f)
                reflectiveCurveTo(7.79f, 21f, 10f, 21f)
                reflectiveCurveTo(14f, 19.21f, 14f, 17f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _MusicNoteSixteenth!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteSixteenth: ImageVector? = null
