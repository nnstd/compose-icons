package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MaterialUi: ImageVector
    get() {
        if (_MaterialUi != null) {
            return _MaterialUi!!
        }
        _MaterialUi = ImageVector.Builder(
            name = "MaterialUi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 16.61f)
                verticalLineTo(15.37f)
                lineTo(14f, 11.91f)
                verticalLineTo(7.23f)
                lineTo(9f, 10.12f)
                lineTo(4f, 7.23f)
                verticalLineTo(13f)
                lineTo(3f, 13.58f)
                lineTo(2f, 13f)
                verticalLineTo(5f)
                lineTo(3.07f, 4.38f)
                lineTo(9f, 7.81f)
                lineTo(12.93f, 5.54f)
                lineTo(14.93f, 4.38f)
                lineTo(16f, 5f)
                verticalLineTo(13.06f)
                lineTo(10.92f, 16f)
                lineTo(14.97f, 18.33f)
                lineTo(20f, 15.43f)
                verticalLineTo(11f)
                lineTo(21f, 10.42f)
                lineTo(22f, 11f)
                verticalLineTo(16.58f)
                lineTo(14.97f, 20.64f)
                lineTo(8f, 16.61f)
                moveTo(22f, 9.75f)
                lineTo(21f, 10.33f)
                lineTo(20f, 9.75f)
                verticalLineTo(8.58f)
                lineTo(21f, 8f)
                lineTo(22f, 8.58f)
                verticalLineTo(9.75f)
                close()
            }
        }.build()

        return _MaterialUi!!
    }

@Suppress("ObjectPropertyName")
private var _MaterialUi: ImageVector? = null
