package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OctagramEdit: ImageVector
    get() {
        if (_OctagramEdit != null) {
            return _OctagramEdit!!
        }
        _OctagramEdit = ImageVector.Builder(
            name = "OctagramEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.2f, 16.06f)
                lineTo(3.88f, 12f)
                lineTo(2.2f, 7.94f)
                lineTo(6.26f, 6.26f)
                lineTo(7.94f, 2.2f)
                lineTo(12f, 3.88f)
                lineTo(16.06f, 2.2f)
                lineTo(17.74f, 6.26f)
                lineTo(21.8f, 7.94f)
                lineTo(20.94f, 10f)
                curveTo(20.38f, 10.06f, 19.82f, 10.3f, 19.38f, 10.75f)
                lineTo(11f, 19.13f)
                verticalLineTo(20.53f)
                lineTo(7.94f, 21.8f)
                lineTo(6.26f, 17.74f)
                lineTo(2.2f, 16.06f)
                moveTo(19.83f, 13.13f)
                lineTo(20.81f, 12.15f)
                curveTo(21f, 11.95f, 21.33f, 11.95f, 21.53f, 12.15f)
                lineTo(22.85f, 13.47f)
                curveTo(23.05f, 13.67f, 23.05f, 14f, 22.85f, 14.19f)
                lineTo(21.87f, 15.17f)
                lineTo(19.83f, 13.13f)
                moveTo(21.17f, 15.88f)
                lineTo(15.04f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(19.96f)
                lineTo(19.13f, 13.83f)
                lineTo(21.17f, 15.88f)
                lineTo(21.17f, 15.88f)
                close()
            }
        }.build()

        return _OctagramEdit!!
    }

@Suppress("ObjectPropertyName")
private var _OctagramEdit: ImageVector? = null
