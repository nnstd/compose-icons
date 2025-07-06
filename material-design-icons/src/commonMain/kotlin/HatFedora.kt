package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HatFedora: ImageVector
    get() {
        if (_HatFedora != null) {
            return _HatFedora!!
        }
        _HatFedora = ImageVector.Builder(
            name = "HatFedora",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.11f, 11.92f)
                curveTo(19.13f, 11.71f, 19.14f, 11.5f, 19.14f, 11.29f)
                curveTo(19.14f, 7.86f, 17.71f, 4.14f, 16.28f, 4.14f)
                curveTo(14.85f, 4.14f, 13.42f, 5.57f, 12f, 5.57f)
                curveTo(10.57f, 5.57f, 9.14f, 4.14f, 7.71f, 4.14f)
                curveTo(6.28f, 4.14f, 4.86f, 7.79f, 4.86f, 11.29f)
                curveTo(4.86f, 11.5f, 4.86f, 11.71f, 4.88f, 11.92f)
                curveTo(7.22f, 12.45f, 9.6f, 12.72f, 12f, 12.71f)
                curveTo(14.45f, 12.71f, 16.83f, 12.44f, 19.11f, 11.92f)
                moveTo(3.45f, 18.18f)
                curveTo(9f, 19.85f, 14.96f, 19.86f, 20.54f, 18.18f)
                curveTo(20.96f, 18.04f, 21.33f, 17.77f, 21.59f, 17.41f)
                curveTo(21.85f, 17.05f, 22f, 16.61f, 22f, 16.17f)
                curveTo(22f, 15.72f, 21.86f, 15.29f, 21.61f, 14.92f)
                curveTo(21.35f, 14.56f, 21f, 14.29f, 20.56f, 14.14f)
                curveTo(17.86f, 15f, 15f, 15.45f, 12f, 15.45f)
                curveTo(9f, 15.45f, 6.13f, 15f, 3.43f, 14.14f)
                curveTo(3f, 14.29f, 2.65f, 14.57f, 2.39f, 14.93f)
                curveTo(2.14f, 15.29f, 2f, 15.72f, 2f, 16.17f)
                curveTo(2f, 17.11f, 2.61f, 17.9f, 3.45f, 18.18f)
                verticalLineTo(18.18f)
                close()
            }
        }.build()

        return _HatFedora!!
    }

@Suppress("ObjectPropertyName")
private var _HatFedora: ImageVector? = null
