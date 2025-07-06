package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BagSuitcase: ImageVector
    get() {
        if (_BagSuitcase != null) {
            return _BagSuitcase!!
        }
        _BagSuitcase = ImageVector.Builder(
            name = "BagSuitcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.03f, 6f)
                curveTo(18.11f, 6f, 19f, 6.88f, 19f, 8f)
                verticalLineTo(19f)
                curveTo(19f, 20.13f, 18.11f, 21f, 17.03f, 21f)
                curveTo(17.03f, 21.58f, 16.56f, 22f, 16f, 22f)
                curveTo(15.5f, 22f, 15f, 21.58f, 15f, 21f)
                horizontalLineTo(9f)
                curveTo(9f, 21.58f, 8.5f, 22f, 8f, 22f)
                curveTo(7.44f, 22f, 6.97f, 21.58f, 6.97f, 21f)
                curveTo(5.89f, 21f, 5f, 20.13f, 5f, 19f)
                verticalLineTo(8f)
                curveTo(5f, 6.88f, 5.89f, 6f, 6.97f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                curveTo(9f, 2.42f, 9.46f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(14.54f, 2f, 15f, 2.42f, 15f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(17.03f)
                moveTo(13.5f, 6f)
                verticalLineTo(3.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(6f)
                horizontalLineTo(13.5f)
                moveTo(8f, 9f)
                verticalLineTo(18f)
                horizontalLineTo(9.5f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                moveTo(14.5f, 9f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(14.5f)
                moveTo(11.25f, 9f)
                verticalLineTo(18f)
                horizontalLineTo(12.75f)
                verticalLineTo(9f)
                horizontalLineTo(11.25f)
                close()
            }
        }.build()

        return _BagSuitcase!!
    }

@Suppress("ObjectPropertyName")
private var _BagSuitcase: ImageVector? = null
