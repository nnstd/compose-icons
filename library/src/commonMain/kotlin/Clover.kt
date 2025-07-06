package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Clover: ImageVector
    get() {
        if (_Clover != null) {
            return _Clover!!
        }
        _Clover = ImageVector.Builder(
            name = "Clover",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11.18f)
                curveTo(15.3f, 8.18f, 17f, 6.64f, 17f, 4.69f)
                curveTo(17f, 3.19f, 15.75f, 2f, 14.25f, 2f)
                curveTo(13.39f, 2f, 12.57f, 2.36f, 12f, 3f)
                curveTo(11.43f, 2.36f, 10.61f, 2f, 9.69f, 2f)
                curveTo(8.19f, 2f, 7f, 3.25f, 7f, 4.75f)
                curveTo(7f, 6.64f, 8.7f, 8.18f, 12f, 11.18f)
                moveTo(11.18f, 12f)
                curveTo(8.18f, 8.7f, 6.64f, 7f, 4.69f, 7f)
                curveTo(3.19f, 7f, 2f, 8.25f, 2f, 9.75f)
                curveTo(2f, 10.61f, 2.36f, 11.43f, 3f, 12f)
                curveTo(2.36f, 12.57f, 2f, 13.39f, 2f, 14.31f)
                curveTo(2f, 15.81f, 3.25f, 17f, 4.75f, 17f)
                curveTo(6.64f, 17f, 8.18f, 15.3f, 11.18f, 12f)
                moveTo(12.83f, 12f)
                curveTo(15.82f, 15.3f, 17.36f, 17f, 19.31f, 17f)
                curveTo(20.81f, 17f, 22f, 15.75f, 22f, 14.25f)
                curveTo(22f, 13.39f, 21.64f, 12.57f, 21f, 12f)
                curveTo(21.64f, 11.43f, 22f, 10.61f, 22f, 9.69f)
                curveTo(22f, 8.19f, 20.75f, 7f, 19.25f, 7f)
                curveTo(17.36f, 7f, 15.82f, 8.7f, 12.83f, 12f)
                moveTo(12f, 12.82f)
                curveTo(8.7f, 15.82f, 7f, 17.36f, 7f, 19.31f)
                curveTo(7f, 20.81f, 8.25f, 22f, 9.75f, 22f)
                curveTo(10.61f, 22f, 11.43f, 21.64f, 12f, 21f)
                curveTo(12.57f, 21.64f, 13.39f, 22f, 14.31f, 22f)
                curveTo(15.81f, 22f, 17f, 20.75f, 17f, 19.25f)
                curveTo(17f, 17.36f, 15.3f, 15.82f, 12f, 12.82f)
                close()
            }
        }.build()

        return _Clover!!
    }

@Suppress("ObjectPropertyName")
private var _Clover: ImageVector? = null
