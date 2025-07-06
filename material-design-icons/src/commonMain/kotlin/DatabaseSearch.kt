package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseSearch: ImageVector
    get() {
        if (_DatabaseSearch != null) {
            return _DatabaseSearch!!
        }
        _DatabaseSearch = ImageVector.Builder(
            name = "DatabaseSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.68f, 12.32f)
                curveTo(16.92f, 10.56f, 14.07f, 10.57f, 12.32f, 12.33f)
                curveTo(10.56f, 14.09f, 10.56f, 16.94f, 12.32f, 18.69f)
                curveTo(13.81f, 20.17f, 16.11f, 20.43f, 17.89f, 19.32f)
                lineTo(21f, 22.39f)
                lineTo(22.39f, 21f)
                lineTo(19.3f, 17.89f)
                curveTo(20.43f, 16.12f, 20.17f, 13.8f, 18.68f, 12.32f)
                moveTo(17.27f, 17.27f)
                curveTo(16.29f, 18.25f, 14.71f, 18.24f, 13.73f, 17.27f)
                curveTo(12.76f, 16.29f, 12.76f, 14.71f, 13.74f, 13.73f)
                curveTo(14.71f, 12.76f, 16.29f, 12.76f, 17.27f, 13.73f)
                curveTo(18.24f, 14.71f, 18.24f, 16.29f, 17.27f, 17.27f)
                moveTo(10.9f, 20.1f)
                curveTo(10.25f, 19.44f, 9.74f, 18.65f, 9.42f, 17.78f)
                curveTo(6.27f, 17.25f, 4f, 15.76f, 4f, 14f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.58f, 21f, 12f, 21f)
                verticalLineTo(21f)
                curveTo(11.6f, 20.74f, 11.23f, 20.44f, 10.9f, 20.1f)
                moveTo(4f, 9f)
                verticalLineTo(12f)
                curveTo(4f, 13.68f, 6.07f, 15.12f, 9f, 15.7f)
                curveTo(9f, 15.63f, 9f, 15.57f, 9f, 15.5f)
                curveTo(9f, 14.57f, 9.2f, 13.65f, 9.58f, 12.81f)
                curveTo(6.34f, 12.3f, 4f, 10.79f, 4f, 9f)
                moveTo(12f, 3f)
                curveTo(7.58f, 3f, 4f, 4.79f, 4f, 7f)
                curveTo(4f, 9f, 7f, 10.68f, 10.85f, 11f)
                horizontalLineTo(10.9f)
                curveTo(12.1f, 9.74f, 13.76f, 9f, 15.5f, 9f)
                curveTo(16.41f, 9f, 17.31f, 9.19f, 18.14f, 9.56f)
                curveTo(19.17f, 9.09f, 19.87f, 8.12f, 20f, 7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                close()
            }
        }.build()

        return _DatabaseSearch!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseSearch: ImageVector? = null
