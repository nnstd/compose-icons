package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OctagramEditOutline: ImageVector
    get() {
        if (_OctagramEditOutline != null) {
            return _OctagramEditOutline!!
        }
        _OctagramEditOutline = ImageVector.Builder(
            name = "OctagramEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.88f, 12f)
                lineTo(2.2f, 16.06f)
                lineTo(6.26f, 17.74f)
                lineTo(7.94f, 21.8f)
                lineTo(11f, 20.53f)
                verticalLineTo(18.36f)
                lineTo(9f, 19.19f)
                lineTo(7.79f, 16.21f)
                lineTo(4.81f, 15f)
                lineTo(6.05f, 12f)
                lineTo(4.81f, 9f)
                lineTo(7.79f, 7.79f)
                lineTo(9f, 4.81f)
                lineTo(12f, 6.05f)
                lineTo(15f, 4.81f)
                lineTo(16.21f, 7.79f)
                lineTo(19.19f, 9f)
                lineTo(17.95f, 12f)
                lineTo(18f, 12.13f)
                lineTo(19.38f, 10.75f)
                curveTo(19.82f, 10.3f, 20.38f, 10.06f, 20.94f, 10f)
                lineTo(21.8f, 7.94f)
                lineTo(17.74f, 6.26f)
                lineTo(16.06f, 2.2f)
                lineTo(12f, 3.88f)
                lineTo(7.94f, 2.2f)
                lineTo(6.26f, 6.26f)
                lineTo(2.2f, 7.94f)
                lineTo(3.88f, 12f)
                moveTo(22.85f, 13.47f)
                lineTo(21.53f, 12.15f)
                curveTo(21.33f, 11.95f, 21f, 11.95f, 20.81f, 12.15f)
                lineTo(19.83f, 13.13f)
                lineTo(21.87f, 15.17f)
                lineTo(22.85f, 14.19f)
                curveTo(23.05f, 14f, 23.05f, 13.67f, 22.85f, 13.47f)
                moveTo(13f, 19.96f)
                verticalLineTo(22f)
                horizontalLineTo(15.04f)
                lineTo(21.17f, 15.88f)
                lineTo(19.13f, 13.83f)
                lineTo(13f, 19.96f)
                close()
            }
        }.build()

        return _OctagramEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _OctagramEditOutline: ImageVector? = null
