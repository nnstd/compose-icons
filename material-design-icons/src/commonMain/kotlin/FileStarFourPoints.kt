package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileStarFourPoints: ImageVector
    get() {
        if (_FileStarFourPoints != null) {
            return _FileStarFourPoints!!
        }
        _FileStarFourPoints = ImageVector.Builder(
            name = "FileStarFourPoints",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                curveTo(4f, 2.89f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(14f)
                lineTo(20f, 8f)
                verticalLineTo(20f)
                curveTo(20f, 20.53f, 19.79f, 21.04f, 19.41f, 21.41f)
                curveTo(19.04f, 21.79f, 18.53f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(5.47f, 22f, 4.96f, 21.79f, 4.59f, 21.41f)
                curveTo(4.21f, 21.04f, 4f, 20.53f, 4f, 20f)
                verticalLineTo(4f)
                moveTo(13f, 3.5f)
                verticalLineTo(9f)
                horizontalLineTo(18.5f)
                lineTo(13f, 3.5f)
                moveTo(12f, 11f)
                lineTo(10.74f, 13.75f)
                lineTo(8f, 15f)
                lineTo(10.74f, 16.26f)
                lineTo(12f, 19f)
                lineTo(13.25f, 16.26f)
                lineTo(16f, 15f)
                lineTo(13.25f, 13.75f)
                lineTo(12f, 11f)
                close()
            }
        }.build()

        return _FileStarFourPoints!!
    }

@Suppress("ObjectPropertyName")
private var _FileStarFourPoints: ImageVector? = null
