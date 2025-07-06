package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileStarFourPointsOutline: ImageVector
    get() {
        if (_FileStarFourPointsOutline != null) {
            return _FileStarFourPointsOutline!!
        }
        _FileStarFourPointsOutline = ImageVector.Builder(
            name = "FileStarFourPointsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11f)
                lineTo(10.74f, 13.75f)
                lineTo(8f, 15f)
                lineTo(10.74f, 16.26f)
                lineTo(12f, 19f)
                lineTo(13.25f, 16.26f)
                lineTo(16f, 15f)
                lineTo(13.25f, 13.75f)
                lineTo(12f, 11f)
                moveTo(6f, 2f)
                horizontalLineTo(14f)
                lineTo(20f, 8f)
                verticalLineTo(20f)
                curveTo(20f, 21.1f, 19.1f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.9f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.9f, 2f, 6f, 2f)
                moveTo(6f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _FileStarFourPointsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileStarFourPointsOutline: ImageVector? = null
