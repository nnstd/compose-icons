package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleCardboard: ImageVector
    get() {
        if (_GoogleCardboard != null) {
            return _GoogleCardboard!!
        }
        _GoogleCardboard = ImageVector.Builder(
            name = "GoogleCardboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.74f, 6f)
                horizontalLineTo(3.2f)
                curveTo(2.55f, 6f, 2f, 6.57f, 2f, 7.27f)
                verticalLineTo(17.73f)
                curveTo(2f, 18.43f, 2.55f, 19f, 3.23f, 19f)
                horizontalLineTo(8f)
                curveTo(8.54f, 19f, 9f, 18.68f, 9.16f, 18.21f)
                lineTo(10.55f, 14.74f)
                curveTo(10.79f, 14.16f, 11.35f, 13.75f, 12f, 13.75f)
                curveTo(12.65f, 13.75f, 13.21f, 14.16f, 13.45f, 14.74f)
                lineTo(14.84f, 18.21f)
                curveTo(15.03f, 18.68f, 15.46f, 19f, 15.95f, 19f)
                horizontalLineTo(20.74f)
                curveTo(21.45f, 19f, 22f, 18.43f, 22f, 17.73f)
                verticalLineTo(7.27f)
                curveTo(22f, 6.57f, 21.45f, 6f, 20.74f, 6f)
                moveTo(7.22f, 14.58f)
                curveTo(6f, 14.58f, 5f, 13.55f, 5f, 12.29f)
                curveTo(5f, 11f, 6f, 10f, 7.22f, 10f)
                curveTo(8.44f, 10f, 9.43f, 11f, 9.43f, 12.29f)
                curveTo(9.43f, 13.55f, 8.44f, 14.58f, 7.22f, 14.58f)
                moveTo(16.78f, 14.58f)
                curveTo(15.56f, 14.58f, 14.57f, 13.55f, 14.57f, 12.29f)
                curveTo(14.57f, 11.03f, 15.56f, 10f, 16.78f, 10f)
                curveTo(18f, 10f, 19f, 11.03f, 19f, 12.29f)
                curveTo(19f, 13.55f, 18f, 14.58f, 16.78f, 14.58f)
                close()
            }
        }.build()

        return _GoogleCardboard!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleCardboard: ImageVector? = null
