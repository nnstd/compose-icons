package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Aurora: ImageVector
    get() {
        if (_Aurora != null) {
            return _Aurora!!
        }
        _Aurora = ImageVector.Builder(
            name = "Aurora",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                curveTo(2.55f, 3f, 3f, 3.45f, 3f, 4f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                curveTo(5f, 4.45f, 5.45f, 4f, 6f, 4f)
                curveTo(6.55f, 4f, 7f, 4.45f, 7f, 5f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                curveTo(9f, 5.45f, 9.45f, 5f, 10f, 5f)
                curveTo(10.55f, 5f, 11f, 5.45f, 11f, 6f)
                verticalLineTo(13f)
                horizontalLineTo(12.5f)
                curveTo(12.67f, 13f, 12.84f, 13f, 13f, 13.05f)
                verticalLineTo(7f)
                curveTo(13f, 6.45f, 13.45f, 6f, 14f, 6f)
                curveTo(14.55f, 6f, 15f, 6.45f, 15f, 7f)
                verticalLineTo(15.5f)
                curveTo(15f, 16.88f, 13.88f, 18f, 12.5f, 18f)
                horizontalLineTo(11.5f)
                curveTo(11.22f, 18f, 11f, 18.22f, 11f, 18.5f)
                curveTo(11f, 18.78f, 11.22f, 19f, 11.5f, 19f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                curveTo(17f, 7.45f, 17.45f, 7f, 18f, 7f)
                curveTo(18.55f, 7f, 19f, 7.45f, 19f, 8f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                curveTo(21f, 8.45f, 21.45f, 8f, 22f, 8f)
                curveTo(22.55f, 8f, 23f, 8.45f, 23f, 9f)
                verticalLineTo(20f)
                curveTo(23f, 20.55f, 22.55f, 21f, 22f, 21f)
                horizontalLineTo(11.5f)
                curveTo(10.12f, 21f, 9f, 19.88f, 9f, 18.5f)
                curveTo(9f, 17.12f, 10.12f, 16f, 11.5f, 16f)
                horizontalLineTo(12.5f)
                curveTo(12.78f, 16f, 13f, 15.78f, 13f, 15.5f)
                curveTo(13f, 15.22f, 12.78f, 15f, 12.5f, 15f)
                horizontalLineTo(2f)
                curveTo(1.45f, 15f, 1f, 14.55f, 1f, 14f)
                verticalLineTo(4f)
                curveTo(1f, 3.45f, 1.45f, 3f, 2f, 3f)
                close()
            }
        }.build()

        return _Aurora!!
    }

@Suppress("ObjectPropertyName")
private var _Aurora: ImageVector? = null
