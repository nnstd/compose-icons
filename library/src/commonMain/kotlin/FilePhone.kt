package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilePhone: ImageVector
    get() {
        if (_FilePhone != null) {
            return _FilePhone!!
        }
        _FilePhone = ImageVector.Builder(
            name = "FilePhone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(17f, 19.44f)
                curveTo(17f, 19.75f, 16.75f, 20f, 16.44f, 20f)
                curveTo(11.23f, 20f, 7f, 15.77f, 7f, 10.56f)
                curveTo(7f, 10.25f, 7.25f, 10f, 7.56f, 10f)
                horizontalLineTo(9.5f)
                curveTo(9.81f, 10f, 10.06f, 10.25f, 10.06f, 10.56f)
                curveTo(10.06f, 11.25f, 10.17f, 11.92f, 10.37f, 12.54f)
                curveTo(10.43f, 12.73f, 10.39f, 12.95f, 10.23f, 13.11f)
                lineTo(9f, 14.33f)
                curveTo(9.81f, 15.9f, 11.1f, 17.19f, 12.67f, 18f)
                lineTo(13.9f, 16.77f)
                curveTo(14.05f, 16.61f, 14.27f, 16.57f, 14.46f, 16.63f)
                curveTo(15.08f, 16.83f, 15.75f, 16.95f, 16.45f, 16.95f)
                curveTo(16.75f, 16.95f, 17f, 17.19f, 17f, 17.5f)
                verticalLineTo(19.44f)
                moveTo(13f, 9f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _FilePhone!!
    }

@Suppress("ObjectPropertyName")
private var _FilePhone: ImageVector? = null
