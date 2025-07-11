package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectionEllipse: ImageVector
    get() {
        if (_SelectionEllipse != null) {
            return _SelectionEllipse!!
        }
        _SelectionEllipse = ImageVector.Builder(
            name = "SelectionEllipse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.35f, 20.25f)
                lineTo(7.56f, 18.66f)
                curveTo(8.42f, 19.23f, 9.39f, 19.64f, 10.43f, 19.85f)
                lineTo(10.16f, 21.83f)
                curveTo(8.77f, 21.57f, 7.5f, 21f, 6.35f, 20.25f)
                moveTo(16.43f, 18.66f)
                lineTo(17.64f, 20.26f)
                curveTo(16.5f, 21.03f, 15.23f, 21.57f, 13.84f, 21.83f)
                lineTo(13.57f, 19.85f)
                curveTo(14.61f, 19.64f, 15.57f, 19.23f, 16.43f, 18.66f)
                moveTo(19.84f, 13.59f)
                lineTo(21.83f, 13.86f)
                curveTo(21.57f, 15.25f, 21f, 16.54f, 20.24f, 17.66f)
                lineTo(18.65f, 16.45f)
                curveTo(19.22f, 15.6f, 19.63f, 14.63f, 19.84f, 13.59f)
                moveTo(2.17f, 13.84f)
                lineTo(4.15f, 13.57f)
                curveTo(4.36f, 14.61f, 4.77f, 15.58f, 5.34f, 16.44f)
                lineTo(3.75f, 17.65f)
                curveTo(3f, 16.5f, 2.43f, 15.23f, 2.17f, 13.84f)
                moveTo(18.66f, 7.56f)
                lineTo(20.25f, 6.35f)
                curveTo(21.03f, 7.5f, 21.58f, 8.78f, 21.83f, 10.18f)
                lineTo(19.85f, 10.45f)
                curveTo(19.64f, 9.4f, 19.23f, 8.42f, 18.66f, 7.56f)
                moveTo(13.57f, 4.15f)
                lineTo(13.84f, 2.17f)
                curveTo(15.23f, 2.43f, 16.5f, 3f, 17.65f, 3.75f)
                lineTo(16.44f, 5.34f)
                curveTo(15.58f, 4.77f, 14.61f, 4.36f, 13.57f, 4.15f)
                moveTo(7.56f, 5.34f)
                lineTo(6.35f, 3.75f)
                curveTo(7.5f, 3f, 8.77f, 2.43f, 10.16f, 2.17f)
                lineTo(10.43f, 4.15f)
                curveTo(9.39f, 4.36f, 8.42f, 4.77f, 7.56f, 5.34f)
                moveTo(4.15f, 10.43f)
                lineTo(2.17f, 10.16f)
                curveTo(2.43f, 8.77f, 3f, 7.5f, 3.75f, 6.35f)
                lineTo(5.34f, 7.56f)
                curveTo(4.77f, 8.42f, 4.36f, 9.39f, 4.15f, 10.43f)
                close()
            }
        }.build()

        return _SelectionEllipse!!
    }

@Suppress("ObjectPropertyName")
private var _SelectionEllipse: ImageVector? = null
